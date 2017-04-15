SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "cbe59ff59ea20d8a0b4ab423c9cad29a"
SRC_URI[sha256sum] = "3d0d6b6f1d5fee4243c94a73eaeb73e971ba6649ddb04c5ff21d90a8d49fc36b"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros"
