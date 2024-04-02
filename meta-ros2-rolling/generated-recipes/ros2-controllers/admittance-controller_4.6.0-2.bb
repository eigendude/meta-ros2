# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Implementation of admittance controllers for different input and output interface."
AUTHOR = "Denis Štogl <denis@stogl.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_controllers"
ROS_BPN = "admittance_controller"

ROS_BUILD_DEPENDS = " \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    filters \
    generate-parameter-library \
    geometry-msgs \
    hardware-interface \
    joint-trajectory-controller \
    kinematics-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    filters \
    generate-parameter-library \
    geometry-msgs \
    hardware-interface \
    joint-trajectory-controller \
    kinematics-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    backward-ros \
    control-msgs \
    control-toolbox \
    controller-interface \
    filters \
    generate-parameter-library \
    geometry-msgs \
    hardware-interface \
    joint-trajectory-controller \
    kinematics-interface \
    pluginlib \
    rclcpp \
    rclcpp-lifecycle \
    realtime-tools \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-ros \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    controller-manager \
    hardware-interface-testing \
    kinematics-interface-kdl \
    ros2-control-test-assets \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_controllers-release/archive/release/rolling/admittance_controller/4.6.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/admittance_controller"
SRC_URI = "git://github.com/ros2-gbp/ros2_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "5034742a656f3d6768d21c8ed99efcf49c9c54d3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
