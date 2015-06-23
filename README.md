# Minnowboard fishbowl and maker project
## Be sure to read these [detailed Yocto Project instructions](http://wiki.minnowboard.org/Projects/Maker_Yocto)
### Fishbowl
Fishbowl is an extension of Darren Hart's Minnowboard project, using the iPython notebook to execute code in a web browser. The image comes with many differnet iPython notebook pages for the Minnowboard and various pieces of hardware. It includes all of the Minnowboard maker projects found on the minnowboard wiki [here](http://wiki.minnowboard.org/Projects) as well as important files for experimentation with the board. All the files in the Maker image are included in the Fishbowl image.

Build it with `bitbake fishbowl-image`

### Maker
The maker image does not contain the iPython module for web access, but it does include all the userspace Python drivers and the SPI kernel module. If you don't need the web access to the Minnowboard, you can use this image.

Build it with `bitbake maker-image`
