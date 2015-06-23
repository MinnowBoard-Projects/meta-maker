SUMMARY = "Adafruit GPIO Python userspace code for their hardware"
HOMEPAGE = "http://github.com/steelee/Adafruit_Python_GPIO"
SECTION = "devel/python"
LICENSE = "MIT"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=bda1c9cc018bbe5da02d845724b71d55"

PR = "r0"
SRCNAME = "Adafruit_Python_GPIO"

SRC_URI = "http://github.com/steelee/Adafruit_Python_GPIO/archive/master.tar.gz"

SRC_URI[md5sum] = "2dc19b8d59e89e5336330e256abcb59f"
SRC_URI[sha256sum] = "9c5b3d78391fd22a9f5adc9abbafe9cf229f7c5c4d31ce785d9be7679df24eaa"

inherit setuptools

do_fetch(){
    rm -rf ${S}/Adafruit_Python_GPIO
    git clone http://github.com/steelee/Adafruit_Python_GPIO.git ${S}/Adafruit_Python_GPIO
    mv ${S}/Adafruit_Python_GPIO/* ${S}
}

RDEPENDS_${PN} += "python-core"

do_unpack[noexec] = "1"
