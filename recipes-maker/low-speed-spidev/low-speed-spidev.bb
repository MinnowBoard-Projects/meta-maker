SUMMARY = "Minnowboard MAX Spi module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d41d8cd98f00b204e9800998ecf8427e"
PR = "r0"
PV = "0.1"

inherit module

SRC_URI = "file://low-speed-spidev.c \
                file://Makefile \
                file://COPYING \
                "
            
S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
