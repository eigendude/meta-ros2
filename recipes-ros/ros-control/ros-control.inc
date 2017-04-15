SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dfd791ad7ed7fc80596c84b8eddd0597"
SRC_URI[sha256sum] = "6c7e2817591c68cdfcf73beeb03bef3fa093d99b6e45aa1fbd261d5425206811"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_control"
