DESCRIPTION = "The control toolbox contains modules that are useful across all controllers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "control-msgs rosconsole tf roscpp angles message-generation dynamic-reconfigure libtinyxml \
    realtime-tools message-filters ${PYTHON_PN}-rospkg"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "621c5e6d81f347c208f8a94cb67a50d8"
SRC_URI[sha256sum] = "a7566de8c9e9a7ea9ebd121ce5397bbb03c2a6a3319b600fa18b5406e5f408fd"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
