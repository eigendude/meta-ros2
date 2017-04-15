DESCRIPTION = "Common-Lisp ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8aee0c7a114cc7456ae701a06f5383fc"
SRC_URI[sha256sum] = "31d3b86a0e3c0517b743a5c74dc3fe4a533ea22fdd1481b7432aa5f7b7800a0d"

inherit catkin
