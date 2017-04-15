SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "379a478594fe5ef7447812fc91a3a821"
SRC_URI[sha256sum] = "2895916cf93c4590ed26a4d75a15625949ed2f80857ba95ba7d3301c50cf8faf"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosserial"
