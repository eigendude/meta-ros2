SRC_URI = "https://github.com/RobotWebTools/rosbridge_suite/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "52b13f469758e82fe0f3396ca223e0b7"
SRC_URI[sha256sum] = "acf3051ecc313d915e10b192e52411e90794c094e590af68d3b469edc21cbd3c"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rosbridge_suite"
