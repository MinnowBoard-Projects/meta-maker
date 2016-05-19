DESCRIPTION = "Yocto image for the maker project"

inherit core-image

IMAGE_FSTYPES = "tar.gz cpio.gz ext4"

# General system packages
IMAGE_INSTALL += "zeroconf"
IMAGE_INSTALL += "kernel-modules"
IMAGE_INSTALL += "openssh"
IMAGE_INSTALL += "xf86-video-fbdev"
IMAGE_INSTALL += "vim"

# Python PIP - Useful for prototyping prior to image integration
IMAGE_INSTALL += "python-pip"
# dizzy branch is missing this dependency in python-pip
# http://lists.openembedded.org/pipermail/openembedded-devel/2015-February/100162.html
IMAGE_INSTALL += "python-distribute"

# Python libraries
IMAGE_INSTALL += "mraa python-mraa"
# PyLab - consider moving these to their own image (~40MB)
IMAGE_INSTALL += "python-numpy python-matplotlib"

IMAGE_INSTALL += "i2c-tools"
IMAGE_INSTALL += "python-maker"
IMAGE_INSTALL_append += "python-adafruit"

IMAGE_INSTALL_append += "python-pycparser"
IMAGE_INSTALL_append += "python-Imaging"
IMAGE_INSTALL_append += "python-cffi"
IMAGE_INSTALL_append += "python-smbus-cffi"
IMAGE_INSTALL_append += "python-spidev"
IMAGE_INSTALL_append += "low-speed-spidev"
IMAGE_INSTALL_append += "maker"

ALLOW_EMPTY_${PN} = "1"
ALLOW_EMPTY_${PN}-dev = "1"
ALLOW_EMPTY_${PN}-staticdev = "1"
