SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3939167c9a7c2f2baea88e68da0c53cc"
SRC_URI[sha256sum] = "eac5082ad8a684a9cdfd9dc6cab8e108ad253845a346990f6eeabf05db8ca30f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin ros-insane

ROS_SPN = "moveit"
