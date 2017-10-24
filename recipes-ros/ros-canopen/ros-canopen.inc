SRC_URI = "https://github.com/ros-industrial/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4d8c5f9d3172c9682505b61c1aa20212"
SRC_URI[sha256sum] = "6a45dbc846ff04c7b4ae6e1cb359ade518b3408f123974a2988d196816ba1d1f"

S = "${WORKDIR}/${ROS_SPN}-${PV}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_canopen"
