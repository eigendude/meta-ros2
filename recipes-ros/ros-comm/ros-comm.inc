SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "37b2143aae431d02a75a48154fc2c48e"
SRC_URI[sha256sum] = "32ba7c055b07502018db3cd70e94690dd55c48c3cf7e4e30836a1ec26f4f36fd"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm"
