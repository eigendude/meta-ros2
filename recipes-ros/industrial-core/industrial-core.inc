SRC_URI = "https://github.com/ros-industrial/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "99be90db9b71e181f601d974151ac227"
SRC_URI[sha256sum] = "6c91604c52e45b25e02c6d182afb726eed545d22ca2abf3674469f0ab1bd5f8f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "industrial_core"
