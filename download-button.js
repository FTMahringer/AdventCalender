// Dynamically creates and adds the download button to the container
document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('download-container');
    const button = document.createElement('a');
    button.href = 'https://raw.githubusercontent.com/ftmahringer/AdventCalender/master/executables/';
    button.download = '';
    button.className = 'download-button';
    button.textContent = 'Download Now';
    container.appendChild(button);
});
