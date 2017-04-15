SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8cb94f06deae8d720c743bccadd550c5"
SRC_URI[sha256sum] = "ddbb3a9780f4d7ab7fcbe63efcb4406403802f33848e868bd1a34a64bd0ca751"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_controllers"
