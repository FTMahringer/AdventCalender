// Dynamically creates and adds the download button to the container
document.addEventListener('DOMContentLoaded', () => {
    const container = document.getElementById('download-container');
    const button = document.createElement('a');
    button.href = 'https://FTMahringer/AdventCalender/executables/AdventCalender-1.0.jar';
    button.download = 'AdventCalender-1.0.jar';
    button.className = 'download-button';
    button.textContent = 'Download Now';
    container.appendChild(button);
});
