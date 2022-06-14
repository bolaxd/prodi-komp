function select(event, pageName) {
    document.getElementById('pages').innerHTML = `<iframe id="${pageName}" src="pages/${pageName}.html" frameborder="0" width="100%" height="700">Browser kmu gak support iframe :(</iframe>`
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" w3-lime", "");
    }
    if (event.currentTarget.tagName.toLowerCase() != 'a') event.currentTarget.className += " w3-lime";
    document.getElementById('head-title').innerHTML = pageName.substring(0, 1).toUpperCase() + pageName.substring(1).replace(/_/g, ' ')
}

function w3_open() {
    document.getElementById("main-page").style.marginLeft = "15%";
    document.getElementById("sidebar-content").style.width = "15%";
    document.getElementById("sidebar-content").style.display = "block";
    document.getElementById("openNav").style.display = 'none';
}

function w3_close() {
    document.getElementById("main-page").style.marginLeft = "0%";
    document.getElementById("sidebar-content").style.display = "none";
    document.getElementById("openNav").style.display = "inline-block";
}


window.addEventListener('DOMContentLoaded', function (e) {
    let pages = ['braga', 'kampung_cai_ranca_upas', 'kawah_putih', 'lembang_park']
    var buttons = document.getElementById('button-pages');
    pagesHTML = ''
    for (let i = 0; i < pages.length; i++) {
        pagesHTML += `<button class="w3-bar-item w3-button tablink w3-border-bottom w3-hover-black" onclick="select(event, '${pages[i]}')">${pages[i].substring(0, 1).toUpperCase() + pages[i].substring(1).replace(/_/g, ' ')}</button>`
    }
    buttons.innerHTML = pagesHTML


    document.getElementById('pages').innerHTML = `<iframe id="home}" src="pages/home.html" frameborder="0" width="100%" height="700">Browser kmu gak support iframe :(</iframe>`
});