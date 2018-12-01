var lightboxExtension=(function (){
  var matches=[];
  return [
    {
      type: 'lang',
      regex: /%cstart%([^]+?)%cend%/gi,
      replace :function(s,match)
      {
        matches.push(match);
        var n = matches.length-1;
        return '%placeholder'+n+'%';
      }
    },
    {
      type: 'output',
      filter: function (text) {
        for (var i=0; i< matches.length; ++i) {
          var pat = '<p>%PLACEHOLDER' + i + '% *<\/p>';

          var links=   matches[i].split(',');
          var imageLink = '';
          imageLink='[';
          for (var j=0 ; j<links.length;j++)
          {
            imageLink=imageLink + '{url:\'' +links[j] + '\'},'
          }
          imageLink= imageLink.substr(0, imageLink.length-1);
          imageLink= imageLink+']';

          var carousel='<pm-carousel [ImageLinks]="'+ imageLink + '"></pm-carousel>';

          //text = text.replace(new RegExp(pat, 'gi'), car);
          text = text.replace(new RegExp(pat, 'gi'), carousel);
        }
        //reset array
        matches = [];
        return text;
      }
    }
  ]
});


var UUID = (function() {
  var self = {};
  var lut = []; for (var i=0; i<256; i++) { lut[i] = (i<16?'0':'')+(i).toString(16); }
  self.generate = function() {
    var d0 = Math.random()*0xffffffff|0;
    var d1 = Math.random()*0xffffffff|0;
    var d2 = Math.random()*0xffffffff|0;
    var d3 = Math.random()*0xffffffff|0;
    return lut[d0&0xff]+lut[d0>>8&0xff]+lut[d0>>16&0xff]+lut[d0>>24&0xff]+'-'+
      lut[d1&0xff]+lut[d1>>8&0xff]+'-'+lut[d1>>16&0x0f|0x40]+lut[d1>>24&0xff]+'-'+
      lut[d2&0x3f|0x80]+lut[d2>>8&0xff]+'-'+lut[d2>>16&0xff]+lut[d2>>24&0xff]+
      lut[d3&0xff]+lut[d3>>8&0xff]+lut[d3>>16&0xff]+lut[d3>>24&0xff];
  }
  return self;
})();
