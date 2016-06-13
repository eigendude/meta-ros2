DESCRIPTION = "EusLisp ROS message and service generators"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/jsk-ros-pkg/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fffce915aff681d6fc5a9d1e867bb7ba"
SRC_URI[sha256sum] = "82837e184338f14024a78aac5cac700d5de8a935d3de2d3ac41bd9e4213cec45"

inherit catkin
