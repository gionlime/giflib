# giflib

#### 使用说明
```shell
        //gif网  https://www.vcg.com/sets/516794080
        String gif = "https://alifei05.cfp.cn/creative/vcg/nowater800/new/VCG211291463845.gif";
        // TODO: 加载网络gif
        GifUtils.loadGifByNetwork(MainActivity.this,gif,imageView);
        // TODO: 加载本地gif图片
        GifUtils.loadGifByResId(MainActivity.this,R.raw.drink_to,imageView);
```