DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "24ad3b11917aef5e7e9c97191fac8e21"
SRC_URI[sha256sum] = "0fd014b4fe6ea3752378d56a6d3daefbdbd2cb6f6437793ad66a7d95fabdbd41"

inherit catkin
