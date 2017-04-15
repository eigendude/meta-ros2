SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4f89a892f26f9da4074f5d6395b57e17"
SRC_URI[sha256sum] = "98aad2f1ba69b5af38c6e6f9cd43ecb5380b13a0dd76b4a70d13df720d0a3050"

DEPENDS += "cpp-common roscpp-serialization message-generation message-runtime std-msgs"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "common_msgs"
