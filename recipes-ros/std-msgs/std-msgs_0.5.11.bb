DESCRIPTION = "Standard ROS Messages including common message types representing primitive data types and other basic message constructs, such as multiarrays. \
    For common, generic robot-specific message types, please see common_msgs."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "84f2e20443ba77f0350704121fe015fe"
SRC_URI[sha256sum] = "111db84305a890a2ab7fdd04229a8ccdb017689d3ae24e6eed7c1b463ee1897d"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
