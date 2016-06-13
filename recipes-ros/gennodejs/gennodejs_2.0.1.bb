DESCRIPTION = "Javascript ROS message and service generators."
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/RethinkRobotics-opensource/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "eeac4a368c981a15c0e9d7b4ee02d2e3"
SRC_URI[sha256sum] = "6380efc25d0c80e0372d1f57dea5e3bd3ab05b537f0477a702fd472965035478"

inherit catkin
