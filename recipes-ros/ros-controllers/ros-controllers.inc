SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "90d4c55cad1a02994efe8cfd9438fd8d"
SRC_URI[sha256sum] = "6d7c03a708b36127d1b8bbd275d82ba8d47064ade06d3b13e843ac9e422a0050"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
