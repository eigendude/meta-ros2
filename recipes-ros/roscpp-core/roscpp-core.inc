SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d04441ddd8436fcd9eed9ffd948762b6"
SRC_URI[sha256sum] = "3564b06f7a45d2de502018356fceb03319e9987c7485158b8654cec4743793f9"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "roscpp_core"
