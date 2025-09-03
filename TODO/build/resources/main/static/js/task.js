// タスク一覧を取得して表示
async function fetchTasks() {
    try {
        const response = await fetch('/tasks');
        const tasks = await response.json();
        const taskList = document.getElementById('task-list');
        taskList.innerHTML = '';

        tasks.forEach(task => {
            const div = document.createElement('div');
            div.className = 'task';
            div.innerHTML = `
                <div class="task-title">${task.title}</div>
                <div>${task.description}</div>
                <div>期限: ${task.dueDate}</div>
                <div>担当: ${task.assignedTo}</div>
                <div>ステータス: ${task.status}</div>
            `;
            taskList.appendChild(div);
        });
    } catch (error) {
        console.error("タスクの取得に失敗しました:", error);
    }
}

// 新しいタスクを追加
document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById('task-form');

    form.addEventListener('submit', async (e) => {
        e.preventDefault();
        const task = {
            title: document.getElementById('title').value,
            description: document.getElementById('description').value,
            dueDate: document.getElementById('dueDate').value,
            assignedTo: document.getElementById('assignedTo').value,
            status: document.getElementById('status').value
        };

        try {
            await fetch('/tasks/request', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(task)
            });
            fetchTasks(); // 更新
            form.reset(); // フォームリセット
        } catch (error) {
            console.error("タスクの追加に失敗しました:", error);
        }
    });

    // 初期表示
    fetchTasks();
});
