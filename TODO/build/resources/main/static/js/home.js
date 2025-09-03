document.addEventListener("DOMContentLoaded", () => {
    const loginBtn = document.getElementById("loginBtn");
    const loginForm = document.getElementById("loginForm");

    loginBtn.addEventListener("click", () => {
        if (loginForm.style.display === "none") {
            loginForm.style.display = "block";
            loginBtn.style.display = "none"; // ボタンは隠す
        } else {
            loginForm.style.display = "none";
            loginBtn.style.display = "block";
        }
    });
});
