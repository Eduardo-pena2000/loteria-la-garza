const fs = require('fs');
let content = 'export const cardImages = {\n';
for(let i=1; i<=54; i++){
  content += `  ${i}: require('../assets/figuras/modern/${i}.jpg'),\n`;
}
content += '};\nexport const FrijolImage = require("../assets/images/ifrijol.png");\n';
fs.writeFileSync('src/assetsMap.js', content);
