SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5bacfb8ee8fab7c6da34c27da5345753"
SRC_URI[sha256sum] = "fc352403eaf495364fca2e7a3f0e736fa683ede21182d96597d9e562fee56a9b"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
