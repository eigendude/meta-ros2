SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "980164f7a005500da83c0be1549361bd"
SRC_URI[sha256sum] = "c9a95df813a375103edb3733ee9c3fa873ec80bc3bd2ca3d34dc1ad194827f63"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "navigation"
