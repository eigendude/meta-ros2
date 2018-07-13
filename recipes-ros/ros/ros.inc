SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e4f6c562330ee88f7a9d42558998982b"
SRC_URI[sha256sum] = "cc3eb0872f33dcf7313c036e52028994f1777e17a668ad4b089e2d73a3e34693"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros"
