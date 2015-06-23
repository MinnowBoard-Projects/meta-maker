SUMMARY = "IPython: Productive Interactive Computing"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.rst;md5=93ef43efbd25773bbce636bbad9d247f"

RDEPENDS_${PN} += "python python-modules"

# Basic dependencies (probably covered by python-modules above)
RDEPENDS_${PN} += "python-readline python-pexpect python-json"

# Notebook dependencies
RDEPENDS_${PN} += "python-jinja2 python-tornado python-mistune python-jsonschema python-pyzmq"
# Web terminal support
RDEPENDS_${PN} += "python-terminado"
# Supposedly for syntax highlighting.... but we get that... so ... ???
#RDEPENDS_${PN} += "python-pygments"

# Test dependencies
# FIXME: how do we just disable tests and not install them in the final image? ~20M
#RDEPENDS_${PN} += "python-nose"
# + mock ???

inherit distutils

SRC_URI = "https://pypi.python.org/packages/source/i/ipython/ipython-${PV}.tar.gz"
SRC_URI[md5sum] = "a749d90c16068687b0ec45a27e72ef8f"
SRC_URI[sha256sum] = "532092d3f06f82b1d8d1e5c37097eae19fcf025f8f6a4b670dd49c3c338d5624"

# FIXME: This probably belongs in a bbappend in recipes-fishbowl?
SRC_URI += "file://minnow-logo.png"
do_install_prepend() {
	cp ${WORKDIR}/minnow-logo.png ${S}/build/lib/IPython/html/static/base/images/logo.png
}
