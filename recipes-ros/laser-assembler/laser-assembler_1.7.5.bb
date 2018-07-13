DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud messages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs message-filters tf roscpp filters laser-geometry pluginlib"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7133f7973447a7f5d1d194ec9c04adeb"
SRC_URI[sha256sum] = "2391d31c20584e4a05465d05bd402c188eb837208b4d4810d96f80de511c4d79"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
