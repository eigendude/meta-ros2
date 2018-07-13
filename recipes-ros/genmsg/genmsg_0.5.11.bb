DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "979282fb3cc8fa89fd039d49ecca917b"
SRC_URI[sha256sum] = "eba6bb64d2e98c33be9cb3c7ad0aa68bea274267c65e78775e24fddeb82ff53c"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-stringold ${PYTHON_PN}-pprint"
RDEPENDS_${PN}_class-native = ""
