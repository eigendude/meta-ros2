DESCRIPTION = "Library for retrieving information about catkin packages."
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
PYPI_PACKAGE = "catkin_pkg_modules"

SRC_URI[md5sum] = "a6d3ec48ff6a81532d08d04c51822918"
SRC_URI[sha256sum] = "5e377552733e16d199b5a7e8ad62f98cd24fe030ea3178c4c89c873d875d58c8"

inherit pypi

RDEPENDS_${PN} = "${PYTHON_PN}-pyparsing"

BBCLASSEXTEND = "native nativesdk"
