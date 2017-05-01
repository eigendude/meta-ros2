SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "03eb2ab45d633dfeefb447251bc8d567"
SRC_URI[sha256sum] = "cb81a2590558b7513f28ef8f9c9571ba9eeb1cae03d2db4c52b0509a70804001"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "yujin_ocs"
