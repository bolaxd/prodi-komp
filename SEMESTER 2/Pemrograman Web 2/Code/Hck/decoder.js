const file = process.argv[2]
const fs = require('fs')
const document = {
    write: (value) => {
        const filename = './file-decoded-' + new Date().valueOf() + '.txt'
        fs.writeFileSync(filename, value)
        console.log("tersimpan di", filename);
    }
}

try {
    if (file) {
        const text = fs.readFileSync(file, 'utf-8')
        eval(text)
    } else {
        console.log("Tambahkan namafile, contoh :\nnode decoder.js file.js");
    }
} catch (e) {
    console.log(e.message);
}