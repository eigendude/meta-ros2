SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "508e43e441a40e7c1135c15e769b1a0d"
SRC_URI[sha256sum] = "75d93d826963ac16635d33665af60d9dfcbed0d487b441487c6c7c9ef22dc524"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_tutorials"
