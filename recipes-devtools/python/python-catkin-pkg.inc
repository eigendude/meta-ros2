DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI += " \
    https://files.pythonhosted.org/packages/5d/ca/b0bcd8b6443fae5735e0f1a7a9955650311eee54742aaba97f0e92d6e676/catkin_pkg-${PV}.tar.gz \
    file://0001-Fix-conflicts-with-catkin_pkg_modules-pip-package-li.patch \
"

SRC_URI[md5sum] = "e5103b99a66a74ca7e5104542a897de2"
SRC_URI[sha256sum] = "77fdfdcf79b1b92498c83eede9ef727e9c6eeec5b0a5e49c0ce83b8caa0afb36"

S = "${WORKDIR}/catkin_pkg-${PV}"

RDEPENDS_${PN} = "${PYTHON_PN}-catkin-pkg-modules ${PYTHON_PN}-unixadmin"
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"
