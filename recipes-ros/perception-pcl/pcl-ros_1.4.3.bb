DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure libeigen nodelet nodelet-topic-tools message-filters tf rosbag pcl pcl-conversions \
  pcl-msgs pluginlib rosbag roscpp sensor-msgs std-msgs tf tf2-eigen"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c8046f14ca809015d4c2b2740af24b6b"
SRC_URI[sha256sum] = "05042dde38bf67ab2c4691a529caa0fd48a1877b10992568a4dda4712ec67e24"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "perception_pcl"
