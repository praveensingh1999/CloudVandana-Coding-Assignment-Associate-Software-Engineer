// Image URLs Array
const images = [
    "https://media.istockphoto.com/id/1161878589/photo/bueatiful-tea-plantation-on-mountain.jpg?s=2048x2048&w=is&k=20&c=S3Zow4qlkOvWySLGoM4MCERydeHBxRbQUjnSKH2vbNY=",
    "https://media.istockphoto.com/id/92269080/photo/journey.jpg?s=1024x1024&w=is&k=20&c=-weed1C2UQUUDdh3cFpwvBHoo9n78CHCs2yGIm40x_E=",
    "https://media.istockphoto.com/id/1031430214/photo/young-woman-kayaking-through-the-backwaters-of-monroe-island.jpg?s=2048x2048&w=is&k=20&c=PdfRF9VqMu2q-i_tH74CWVfROwzPAByhfkD5xXeCDBU=",
    "https://cdn.pixabay.com/photo/2020/05/07/19/49/flower-5142952_1280.jpg"
];

let currentIndex = 0;


function updateImage() {
    document.getElementById("sliderImage").src = images[currentIndex];
}


function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
}


function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
}

// Initialize Slider with First Image
window.onload = updateImage;
