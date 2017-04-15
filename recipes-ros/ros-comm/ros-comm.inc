SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "acf011df82e9787d845c1deef5ad504b"
SRC_URI[sha256sum] = "b5083d0a93468b6ec37a6610c23602bf42d8299043696a1c18dd3cbad2e22eec"

ROS_PKG_SUBDIR ?= ""
S = "${WORKDIR}/${ROS_SP}/${ROS_PKG_SUBDIR}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_comm"
