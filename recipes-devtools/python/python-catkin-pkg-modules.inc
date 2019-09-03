DESCRIPTION = "Library for retrieving information about catkin packages."
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI += " \
    file://catkin_pkg_modules-${PV}.tar.gz \
    file://0001-Fix-conflicts-with-catkin_pkg-pip-package-library.patch \
"

SRC_URI[md5sum] = "94c6d4ac507ecea56b1d19dcea470716"
SRC_URI[sha256sum] = "b3e947cac1793eb4d0c58a83ac5dbb0d3ef557884eccf74b8e60e7802025aaed"

S = "${WORKDIR}/catkin_pkg_modules-${PV}"

RDEPENDS_${PN} = "${PYTHON_PN}-pyparsing"

BBCLASSEXTEND = "native nativesdk"
