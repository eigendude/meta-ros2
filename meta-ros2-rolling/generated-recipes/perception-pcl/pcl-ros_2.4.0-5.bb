# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge for 3D applications involving n-D Point Clouds and 3D geometry   processing in ROS."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Open Perception"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "perception_pcl"
ROS_BPN = "pcl_ros"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    pcl \
    pcl-conversions \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    pcl \
    pcl-conversions \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    pcl \
    pcl-conversions \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/perception_pcl-release/archive/release/rolling/pcl_ros/2.4.0-5.tar.gz
ROS_BRANCH ?= "branch=release/rolling/pcl_ros"
SRC_URI = "git://github.com/ros2-gbp/perception_pcl-release;${ROS_BRANCH};protocol=https"
SRCREV = "0a4aee413124b435212b64bba6a9b56c247b8280"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
