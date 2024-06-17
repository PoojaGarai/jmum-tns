document.getElementById('add-skill').addEventListener('click', function() {
    const skill = prompt('Enter a new skill:');
    if (skill) {
        const li = document.createElement('li');
        li.textContent = skill;
        document.getElementById('skills-list').appendChild(li);
    }
});
