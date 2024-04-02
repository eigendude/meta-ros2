# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Implementation of the Webots - ROS 2 interface"
AUTHOR = "Cyberbotics <support@cyberbotics.com>"
HOMEPAGE = "http://wiki.ros.org/webots_ros2"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "webots_ros2"
ROS_BPN = "webots_ros2_driver"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    rclcpp \
    rclpy \
    ros-environment \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml2-vendor \
    vision-msgs \
    webots-ros2-importer \
    webots-ros2-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
    python-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    rclcpp \
    rclpy \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml2-vendor \
    vision-msgs \
    webots-ros2-importer \
    webots-ros2-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    rclcpp \
    rclpy \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml2-vendor \
    vision-msgs \
    webots-ros2-importer \
    webots-ros2-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/webots_ros2-release/archive/release/rolling/webots_ros2_driver/2023.1.1-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/webots_ros2_driver"
SRC_URI = "git://github.com/ros2-gbp/webots_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "7f0a9289b12009bbf08915d1ea91890de79f62d8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
