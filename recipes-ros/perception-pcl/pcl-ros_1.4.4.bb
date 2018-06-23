DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure libeigen nodelet nodelet-topic-tools message-filters tf rosbag pcl pcl-conversions \
  pcl-msgs pluginlib rosbag roscpp sensor-msgs std-msgs tf tf2-eigen"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "09878e059e8eabade909acb8a90c9663"
SRC_URI[sha256sum] = "ec89c379bc2f02d1b87c5ec7d79a9324705baad2575de94a42b9e26028427739"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "perception_pcl"
