SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f0cb2c9b7c5cca9926fef146460f4ab9"
SRC_URI[sha256sum] = "0d5abe3a6ac918b46fd434173f10c2a86ebf802360e0ab5ef161d6011f739eea"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
