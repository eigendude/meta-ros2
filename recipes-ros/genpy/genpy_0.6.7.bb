DESCRIPTION = "Python ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "52360393c11eaf192dbdb47ca43eb3d7"
SRC_URI[sha256sum] = "d1b6e9031c255bad2b29c5cf76736807c3245e14f017903a9be8bf68a74ede2e"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-math genmsg ${PYTHON_PN}-shell"
RDEPENDS_${PN}_class-native = ""
