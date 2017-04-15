SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "181811fd21d5c6d50e3e6e8166b30266"
SRC_URI[sha256sum] = "128deef55f8948865afe949d7865e8d9b3bcfcf0819e83ed092f3ab12537681f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ar_track_alvar"
