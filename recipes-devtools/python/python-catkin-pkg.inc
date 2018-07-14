DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
PYPI_PACKAGE = "catkin_pkg"

SRC_URI[md5sum] = "b80fd19ba4003ff8fe5e55d2b3ba5a2c"
SRC_URI[sha256sum] = "48d573a420997ea7fa70699685e81a0c42147831be678a54766db7f480a881aa"

inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-unixadmin"
RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"
