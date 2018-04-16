DESCRIPTION = "Standalone Python library for generating ROS message and service data structures for various languages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c09d791580ad6b0f2c56d0a52aed33bc"
SRC_URI[sha256sum] = "e1b57fec83ea8a686499004abc1dc4116b40515ede2ba28d83c6f2da57fb86f0"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-stringold ${PYTHON_PN}-pprint"
RDEPENDS_${PN}_class-native = ""
